# InterviewQuestion
Hello!  Welcome to the Comcast Silicon Valley Test Engineering interview question repo.  Your task is to pick whichever of the interview questions below suits your interest and code up a working solution within 24hrs.  Your instructions are as follows
# Instructions
1. Create a new repo under your personal org in github with the name / number of the question you choose to implement in the name of the org
2. Implement the solution in whatever language you want (we prefer Java but if you are more comfortable in another language please feel free). Your code should be unit tested.
3. Submit the URL of the repo to your comcast recruiters for review by our team
 
# Questions
## 1 - Stock Trader app
Create a stock trader application which buys and sells fixed amounts of stock at random intervals from a fictitious REST-ful endpoint (please define the endpoint as you see fit in order to make your application work - bonus points for using RAML)
## 2 - Meme sorter and scorer
Read in a list of internet memes from a json file on the classpath (you choose the memes!).  Create one method which takes the list of memes and sorts them by name.  Create a second method which associates a "lulz" score (from 1-10) with each meme and writes the updated values to the same json file. 
## 3 - Taxperson
Calculate the total cost of an item including tax based on whether it is considered a necessary or luxury item. The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%. For simplicity of implementation, all transactions are measured in cents (pennies).
## 4 - In-Memory File System
Create a progrm that will mimic a file system in a non-persistent way. Your program should not write anything to the HDDs and when it is restarted, the "file system" should be empty. Your program should handle the following file system commands:
 1. Create a new folder - Takes a parameter of absolute folder path
 2. Create a new file - Take a parameter of absolute file path
 3. Add content to a file - Take 2 parameters: Content to append to a file; Absolute path to a file
 4. Copy files - Takes 2 parameters: Absolute path to a source file; Absolute path to a destination file (NOTE: If destination file exists, it will be overwritten)
 5. Display file contents - Takes absolute path to a file as an input; Prints out file contents as an output
 6. List folder contents - Takes absolute path to a folder as an input; Prints out folder contents as an output
 7. Search for a file by name - Takes name of a file to find; Prints out list of absolute paths to files with matching names
 8. Search for a file by name - Takes 2 parameters: Absolute path to a starting folder and file name; Outputs list of absolute paths to files with matching names
 9. (Bonus) Copy folders - Takes 2 parameters: Absolute path to source folder, Absolute path to destination folder

Your program should be capable of running the following commands:
 1. mkdir /someFolder
 2. create /file1
 3. create /someFolder/file1
 4. write "Some text" /file1
 5. cat /file1
 6. cp /file1 /someFolder/file2
 7. find file2 (Should return all found locations for file2)
 8. find /someFolder file2
 9. ls /someFolder
 10. (Bonus) cp /someFolder /copyFolder

Your program should also handle error cases. Here are some examples:
 1. Creating a file in a non-existent folder
 2. Appending text to a non-existent file
 3. Listing contents of a non-existent folder
 4. Displaying contents of a non-existent file



## 5 - SHA-1 Encryptor
A common security feature of communication protocols is a challenge-response mechanism to ensure each endpoint is authentic. Your task is to write a simple iOS test application to validate the response from such a challenge to assist in the development of the communication protocol.

* The simplified protocol defines a 4-byte device challenge code (DCC) and a 10-byte shared secret key (SSK).
* The response is defined as the SHA-1 hash of the DCC + SSK, where + represents concatenation.
* The SSK shall be defined as 0x00112233445566778899.

Example:
```
DCC = <b363f46a>
DCC + SSK = <b363f46a 00112233 44556677 8899>
SHA1(DCC + SSK) = <371b28a1 b32ecd1a 532822a5 91eac382 3bf80ea5>
```

Your test application should include a text field where the tester can enter a 4-byte hex string as input and then press a button to see the expected response in hex.

For the SHA-1 calculation, please use the CC_SHA1() function from the iOS Security.framework.
## 6 - Maximum yield
You are a Science Engineer on the Federation mining freighter Daedalus. Your team mines strips for a special type of dilithium that is rare and particularly volatile. This has certain implications. 

When your team mines a square in the strip, the trace amounts of dilithium that remain become charged for years. Your team simply cannot mine two squares that are side by side or this would result in an explosion and destroy the planet.

The ship’s sensors can detect the quantity of dilithium in each square in advance. Your team needs to know the optimal squares it should mine, as well as the total yield from a strip of any size so they can bring it before the captain for final approval.

Two strip examples:

[ 206, 140, 300, 52, 107 ] should return 613 units, as mining the first, third, and fifth squares is optimal [ 206, x, 300, x, 107 ]

[ 147, 206, 52, 240, 300 ] should return 506 units, as mining the second and fifth squares is optimal [ x, 206, x, x, 300 ]
