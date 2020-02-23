# Assignment

## Introduction
The project has the capability of multiplying two large numbers which are given as strings. See examples of use.

## Technologies, programming languages, tools and libraries

- Java
- Docker
- Kubernetes
- JUnit
- Swagger
- Rate limiter

## Running the project
In order to run the project run ExerciseApplication.java.

## Running test cases
In order the project to be Unit tested run CalculateRestControllerTest.java.

## Example of use
Example when num1 = “10”, num2 = “10” => 10*10 = 100

Example when num1 = “1235421415454545”, num2 = “1714546546546545454544” => 
1235421415454545*1714546546546545454544= 2118187521397235108814566163395702480 

Example when num1 = “-38218312832818”, num2 = “43848238283” =>
 -38218312832818*43848238283= -1675805687867640406371494

Example when num1 = “0”, num2 = “4384823831223113232321123231123321312283” =>
 0*4384823831223113232321123231123321312283= 0

## Test

- Testing manually with Postman by putting different values for num1 and num2.
- Testing manually with Swagger by putting different values for num1 and num2.
- JUnit test cases.

## How to deploy
 
### Creating docker image
For this step you should have Docker installed and running.

1) Open the project in your favorite IDE and open the terminal. 
2) Find the source folder of the project from the terminal and type: 
“docker build -f Dockerfile -t  docker-spring-boot .”
With this command you will build a docker image based on the information from Dockerfile file which is located in the project folder. 
If you want you can check if your im	age is created type:
 “docker images”
If you want to run the image type: 
“docker run -p 1993:1993 docker-spring-boot”
Open http://localhost:1993/ - the project now is running from docker container.
### Pushing docker image to docker hub
1) Login in the terminal with your credentials by typing “docker login”.
2) Specify the tag by typing “docker tag docker-spring-boot @yourDockerNickname/docker-spring-boot”.
3) Push to DockerHub with “docker push @yourDockerNickname/docker-spring-boot” 

###	Run docker image on Kubernetes cluster/Deploy
For this step you should have Kubernetes installed on your computer as well as minikube running. 

1) Open the deployment.yaml file from the project folder and under “Kind: Deployment” find “image”. There you should change the username “nikovlyubomir” with your DockerHub username. 
2) In the terminal type “kubectl apply -f deployment.yaml” in order to make the deployment. Write “minikube dashboard” to see your deployment.
