import re
import os

# Change this to your txt directory
TXT_DIR = "../../adil-dataset/txt_fixed"
CLEANED_TXT_DIR = "../../adil-dataset/txt_cleaned"

FORBIDDEN = r"^[0-9]+[0-9]\,|-\s+[0-9]{1,2}\s+-|^www\.|^http:\/\/|-[0-9]{1,2}-"


def clean_txt():
    if not os.path.exists(CLEANED_TXT_DIR):
        os.mkdir(CLEANED_TXT_DIR)

    for filename in os.listdir(TXT_DIR):
        if filename.endswith(".txt"):
            with open(os.path.join(TXT_DIR, filename)) as f:
                content = f.readlines()
                for idx, c in enumerate(content):
                    if re.search(FORBIDDEN, c):
                        content.pop(idx)
                cleaned_string = "".join(content)
            with open(os.path.join(CLEANED_TXT_DIR, filename), "w") as cf:
                cf.write(cleaned_string)
        print("Success cleaned {} file".format(filename))


clean_txt()
