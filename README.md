# SpringBootUTF8Test
Test project for verify how spring is handling UTF-8.

## Usage
Start the se.kecon.springbootutf8test.Application class

The program will start at http://localhost:8080

Open a shell or command window and start telnet:

telnet localhost 8080  


Paste the following into the shell:

POST / HTTP/1.1  
Host: localhost  
Content-Type: application/x-www-form-urlencoded  
Content-Length: 174  
  
message_id=KJh94oLA2xpJVHKFtQG6Nt&inbound_address=46737494421&device_address=919986668400&message_orig=%E0%A4%B8%E0%A5%8D%E0%A4%B5%E0%A4%BE%E0%A4%97%E0%A4%A4&carrier=se.tele2


This should give the following output (available in example.txt):  


message_id: KJh94oLA2xpJVHKFtQG6Nt  
inbound_address: 46737494421  
device_address: 919986668400  
message_orig: स्वागत  
carrier: se.tele2  

