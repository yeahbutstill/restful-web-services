# restful-web-services

## Social Media Application

- User -> Posts

## RESTful Web Services
- Retrieve all Users  - GET /users
- Create a User       - POST /users
- Retrieve one User   - GET /users/{id} --> /users/1
- Delete a User       - DELETE /users{id} --> /users/1


- Retrieve all post for a User   - GET /users/{id}/posts
- Create a posts for a User      - POST /users/{id}/posts
- Retrieve details for a post    - GET /users/{id}/posts/{post_id}

## This happened because there were no getters in HelloWorldBean class
### Questions to Answer
- What is dispatcher servlet?
- Who is configuring dispatcher servlet?
- What does dispatcher servlet do?
- How does the HelloWorldBean object get converted to JSON?
- Who is configuring the error mapping?


- Mapping servlet: 'dispatcherServlet' to [/]
- Mapped "{[/hello-world],method[GET]}" onto public java.lang.String com.yeahbutstill.restfulwebservices.controller.HelloWorldController.helloWorld()
- Mapped "{[/hello-world-bean],method[GET]}" onto public java.lang.String com.yeahbutstill.restfulwebservices.beans.HelloWorldBean com.yeahbutstill.restfulwebservices.controller.HelloWorldController.helloWorldBean()
- Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.configure.web.servlet.error.BasicError
- Mapped "{[/error], produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndWiew org.springframework.boot.aut