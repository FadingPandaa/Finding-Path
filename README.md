👨‍💻 Author: Keabetswe Masole

System Used: Apache NetBeans IDE 22

----------------------------------------------------------------------------------------
📖 Project Overview

This Java utility demonstrates the use of the 'java.nio.file' 
package to interact with the file system. It takes a specific 
directory path and breaks it down to reveal the file name, 
the total number of directory levels (elements), and a 
numbered list of each individual folder in the hierarchy.

---------------------------------------------------------------------------------------
 🚧 PROJECT STRUCTURE

The project is contained within the 'findingpath' package:

* FindingPath.java: 
  The main driver class. It utilizes the 'Path' and 'Paths' 
  interfaces to parse a hardcoded directory string and 
  output its metadata to the console.

---------------------------------------------------------------------------------------
🚀 FEATURES

* Path Parsing: Converts a string-based directory address into 
  a functional Path object.
* Metadata Extraction: Identifies the specific file or folder 
  name at the end of a path.
* Component Analysis: Uses a loop to iterate through and 
  display every individual element (folder/directory) 
  contained within the path.

---------------------------------------------------------------------------------------
▶️ HOW TO RUN

1. Compile the source file:
   javac findingpath/FindingPath.java

2. Execute the application:
   java findingpath.FindingPath

---------------------------------------------------------------------------------------
🔄 How It Works

1. User inputs a file or directory path
2. Program checks if the path exists
3. If valid:
  - File/directory is deleted
4. If invalid:
  - Error message is displayed

---------------------------------------------------------------------------------------
⚠️ Limitations

- No confirmation prompt before deletion
- No recovery/undo functionality
- Limited error handling
- Console-based interaction only


---------------------------------------------------------------------------------------
📈 Future Improvements

- Adding confirmation before deleting
- Implement recycle bin functionality
- Improve error handling
- Add GUI interface
- Support batch deletion
