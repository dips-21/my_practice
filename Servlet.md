Servlet  [ web.xml mapping] which class doPost ,doGet 
Servlet 
GenericServlet(for tcp layer)   HTTPServlet
org.Dipali.USerServlet ,mapping /user ,this means GET request user org.Dipali.USerServlet#doGet ,reading from request inputstream object
writing into response outputstream object

Using reflection servlet framework can call method of our servlet ,whose url is matching

Spring
GET /books  BookController.getAllbooks() 
GET /books/{id}  BookController.getAbook(String id) return book
more flexible mapping than servlet 

PUT /books/{id}  BookController.update(Book book)   //deserliasire ( byte stream representation (socket,file etc) to object representation)
http request response abstracted , (for eg json sent {name:"how to worry", title} ,)  

Using reflection , 
annotaton based mapping ,
books/name/{name}
books/{id}

books/123