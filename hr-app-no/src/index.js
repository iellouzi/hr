import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import Navigation from './Navigation'; // Import your Navigation component

ReactDOM.render(
  <React.StrictMode>
    <Navigation />
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);
