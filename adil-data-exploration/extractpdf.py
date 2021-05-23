import os
import re
from tika import parser

DATASET_DIR = "../../adil-dataset"
TXT_DATASET = "../../adil-dataset/txt"


def normalize_content(content):
    content = re.sub(r".*\.doc.*\n?|.*\.pdf.*\n?", "", content)
    content = re.sub(r"\n\s*\n", "\n\n", content)
    return content


def generate_txt_file():
    for filename in os.listdir(DATASET_DIR):
        if filename.endswith(".pdf"):
            f = os.path.join(DATASET_DIR, filename)
            txt_filename = os.path.join(TXT_DATASET, re.sub(r"\.pdf$", ".txt", filename))
            raw = parser.from_file(f)
            content = normalize_content(raw["content"])
            with open(txt_filename, "w+") as txt:
                txt.write(content)


generate_txt_file()
