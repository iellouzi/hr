# Use an official Node.js image as the base image
FROM node:14-alpine

# Set the working directory inside the container
WORKDIR hr-application

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install app dependencies
RUN npm install

# Copy the rest of the app files to the working directory
COPY . .

# Build the React app
RUN npm run build

# Expose the port on which the app will run (usually 3000 for React apps)
EXPOSE 3000

# Start the app
CMD ["npm", "start"]
