# Blog Platform with AI Summarization (Spring Boot + Docker + AWS)

A Spring Boot-based blog platform that allows users to create, retrieve, update, and delete blogs, with an integrated AI-powered summarization feature using OpenAI API. The app is containerized using Docker and deployed on AWS EC2 or AWS Lambda.

# Tech Stack
	•	Java 23
	•	Spring Boot (Spring Web, Spring Data JPA)
	•	MySQL (Dockerized)
	•	OpenAI API (AI-based summarization)
	•	Docker (Containerization)
	•	AWS EC2 / AWS Lambda (Deployment)


#  Setup Instructions:-

# 1.  Clone the Repository
```
git clone https://github.com/your-username/blog-summarizerAI.git
cd blog-summarizer
```

# 2.  Configure Application Properties

```
spring.datasource.url=jdbc:mysql://mysql-container:3306/blogdb
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

openai.api.key=YOUR_OPENAI_API_KEY
```

# 3. Create and Configure Dockerfile

1. Docker File is provided with the .jar file
   
2. Configure Docker.yml file for SQL
   
3. Build Docker iMAGE again using your Docker Hub Username


# 4. Deploy on EC2

  1. Create an EC2 instance from AWS Dashboard.

  2. Connect to the EC2 instance
 
  3.  Install Docker on EC2
    
  4.  Pull the Docker image
     
  5.  Run the container
     
  6.  Access using API
   
