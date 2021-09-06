Protected - access in same package and child class
eg SimpleList ,protected elements[]
DynamicList extends SimpleList use elements[]

private - access within the inner class.
         private or any other can be static.

USE:- validation and controlled,or immutable object.
      less complexity

public -   throughout  the class.
Default -  package level.   
            

* Encapsulation - field private n method public

* Hash map
* Hash set

String BUILDEr/buffer- Strings are immutable so if we want to change it ,everytime new object will have to create.but with the help of buffer/builder we can append it n modify it .
builder n buffer- buffer is synchronized.(objects shared by multiple threads )
String is thread safe.

If we want  friends list from different sources then we have to take append(method) from single thread
then string Builder is used.buffer is already synchronized n it uses multiple thread.  

intern -