FROM tomcat
LABEL authors="Asma"
COPY /livraison/openshiftAPI-1.0.war /usr/local/tomcat/webapps/openshiftAPI.war

CMD ["catalina.sh", "run"]