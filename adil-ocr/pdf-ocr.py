from PIL import Image
import pytesseract
import sys
from pdf2image import convert_from_path
import os

DATASET_DIR = "../../adil-dataset"
TXT_DIR = os.path.join(DATASET_DIR, "txt")

if os.path.exists(TXT_DIR):
    print("Folder already exist")
else:
    os.mkdir(TXT_DIR)
    print("Txt folder created")

for filename in os.listdir(DATASET_DIR):
    if filename.endswith(".pdf"):
        
        PDF_file = filename
        base_filename = os.path.splitext(os.path.basename(filename))[0]
        
        pages = convert_from_path(PDF_file, 500)
        count = 1

        for page in pages:
            filename = "page_"+str(count)+".jpg"
            page.save(filename, 'JPEG')
            count = count + 1

        filelimit = count-1
        
        outfile = base_filename + ".txt"
        print(outfile)

        for i in range(1, filelimit + 1):
            img_name = "page_"+str(i)+".jpg"     
            text = str(((pytesseract.image_to_string(Image.open(img_name)))))
            text = text.replace('-\n', '')    
                
            with open(os.path.join(TXT_DIR, outfile), "a") as f:
                f.write(text)
                    
            os.remove("page_"+str(i)+".jpg")

        f.close()
