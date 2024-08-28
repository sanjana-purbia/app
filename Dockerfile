FROM node:18 as node
WORKDIR /app
COPY package.json .
RUN npm install
COPY . .
RUN npm run build
From nginx
COPY --from=node /app/build/   /usr/share/nginx/html
COPY  --from=node /app/nginx.conf  /etc/nginx/conf.d/default.conf
EXPOSE 80
