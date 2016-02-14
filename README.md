# Load Data from Files to MongoDB

0. Git Clone Pr	oject
0. Create VM on Google Cloud 
0. Connect SSH

	sudo apt-get update
	sudo apt-get install openjdk-8-jre
	
	mkdir data
	cd data
	wget https://s3-eu-west-1.amazonaws.com/eurecat-dataset-historic/twitter/eurecat-bts-dataset-twitter-2015.tar.gz
	
0. Download Data
0. Create Cluster Mongo in Google Cloud
0. Configure port
0. Connect SSH in Primary

https://docs.bitnami.com/google/infrastructure/mongodb/

	gcloud compute copy-files target/demo-load-mongo-0.0.1-SNAPSHOT.jar instance-bts-1:~/
