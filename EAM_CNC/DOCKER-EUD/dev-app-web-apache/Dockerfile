
FROM ubuntu:20.04


LABEL maintainer="Steven Cardona" \
      version="0.1" \
      description="This is a custom Docker Image for Apache Services."


ENV CONTAINER_TIMEZONE=America/Bogota
RUN ln -snf /usr/share/zoneinfo/$CONTAINER_TIMEZONE /etc/localtime && echo $CONTAINER_TIMEZONE > /etc/timezone


RUN apt update -y && apt install -y apache2

COPY index.html /var/www/html/

EXPOSE 80

CMD ["/usr/sbin/apache2", "-D", "FOREGROUND"]
