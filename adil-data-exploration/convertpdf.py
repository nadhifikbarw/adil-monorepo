import os
import tempfile
from pdf2image import convert_from_path


def convert_pdf_pages_to_image():
    DATASET_DIR = "../../adil-dataset"
    IMAGE_DIR = os.path.join(DATASET_DIR, "images")

    if os.path.exists(IMAGE_DIR):
        print("Folder already exist")
    else:
        os.mkdir(IMAGE_DIR)
        print("Image folder created")
        
    for filename in os.listdir(DATASET_DIR):
        if filename.endswith(".pdf"):
            with tempfile.TemporaryDirectory() as path:
                file_dir = os.path.join(DATASET_DIR, filename)
                pages = convert_from_path(file_dir, output_folder=path)
            base_filename = os.path.splitext(os.path.basename(filename))[0]
            new_pdf_dir = "../../adil-dataset/images/" + base_filename
            print(new_pdf_dir)
            try:
                os.mkdir(new_pdf_dir)
            except OSError:
                print("Creation of directory %s failed" % new_pdf_dir)
            else:
                print("Success Create %s directory" % new_pdf_dir)

            for i in range(len(pages)):
                page = pages[i]
                page.save(os.path.join(new_pdf_dir, base_filename + "_{}".format(str(i))) + ".png", "PNG")


convert_pdf_pages_to_image()
