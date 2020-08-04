Cryptology_analysis_program v1.0
================================

<br>Hello. Welcom to my git. This is a Cryptology analysis program develpoed with JAVA<br/>
<br>In this program I will implement a number of functions releated to cryptology.<br/>


****
	
|Author|ssong094@uottawa.ca|
|---|---
|WeChat|tz142857


****
## Table of Contents
* [KeyWord Cipher](#KeyWordCipher)
    * [Demo](#Demo)
   
### KeyWord Cipher
------------------
```
A keyword cipher is a form of monoalphabetic substitution. A keyword is used as the key,   
and it determines the letter matchings of the cipher alphabet to the plain alphabet.   
Repeats of letters in the word are removed, then the cipher alphabet is generated with   
the keyword matching to A, B, C etc. until the keyword is used up, whereupon the rest of   
the ciphertext letters are used in alphabetical order, excluding those already used in   
the key.  
```
  Take the first example, we used "secret" keyword there.  
  **Plain Text : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z**  
  When "secret" keyword is used, the new encypting text becomes :  
  **Encrypting : S E C R T A B D F G H I J K L M N O P Q U V W X Y Z**  
  This means 'A' means 'S', 'B' means 'E' and 'C' means 'C' and so on.  

#### Demo

In the Crptplogyy_analysis_program file. compile ****keyCipher.java**** and run ****keyCipher****.  



![](https://secureservercdn.net/198.71.233.47/k3x.d37.myftpupload.com/wp-content/uploads/2020/08/WeChat-Screenshot_20200804035442.png)  

![](https://secureservercdn.net/198.71.233.47/k3x.d37.myftpupload.com/wp-content/uploads/2020/08/WeChat-Screenshot_20200804035412.png?time=1596528811)  

![](https://secureservercdn.net/198.71.233.47/k3x.d37.myftpupload.com/wp-content/uploads/2020/08/WeChat-Screenshot_20200804035344.png?time=1596528811)  


