FROM nginx:1.18.0-alpine
COPY ./conf/gmauricio.conf /etc/nginx/conf.d/default.conf