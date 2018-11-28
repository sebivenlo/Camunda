# Camunda

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
