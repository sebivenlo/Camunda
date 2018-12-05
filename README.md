# Camunda

## Prerequisites

Camunda Modeler installed:

    https://camunda.com/download/modeler/

Postman installed for REST-API calls:

    https://www.getpostman.com/apps

Docker installed and running:

    https://www.docker.com/get-started

An IDE for Java (e.g. IntelliJ, Netbeans, Eclipse, vim/nano if you are somehow special)

## Setup

CD into the ESDCamunda project :

    cd ESDCamunda/

Create Docker network so that the containers find each other:

    docker network create myNetwork

Pull Docker container that contains the Camunda Platform and run it:

    docker pull camunda/camunda-bpm-platform:latest
    docker run -d --name camunda -p 8080:8080 --network myNetwork camunda/camunda-bpm-platform:latest

"--network myNetwork" joins the new created network

Build the Docker container of the client and run it:

    docker build -t t1:latest .
    docker run --name camunda-client --network myNetwork t1:latest

Again we use "--network myNetwork" to join the same network. Without this option our second container would not be able to access the first one.
"-d" silences the container, --name gives it a name for simple container management.
"-p 8080:8080" maps the ports inside the container to the ports exposed to the network.

Access tasklist:

    http://localhost:8080/camunda/app/tasklist/default/

Access cockpit:

    http://localhost:8080/camunda/app/cockpit/

Login credentials:

    demo / demo



Create customer via REST-API call:

    {
      "variables": {
        "firstName": {
          "value": "Peter"
        },
        "lastName": {
          "value": "Klausen"
        },
        "emailAdress": {
          "value": "my@mail.com"
        },
        "yearlyIncome": {
			    "value": 123123
		    }
      }
    }

Be sure to select application/json for this request, its a POST call.
