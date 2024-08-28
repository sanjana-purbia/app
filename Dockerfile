FROM node:18 AS build

WORKDIR /app

COPY package.json .

RUN npm install

EXPOSE 3000

COPY . .

CMD [ "npm", "start" ]
