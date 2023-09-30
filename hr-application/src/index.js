import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './index.css';
import Navigation from './Navigation';
import CandidateComponent from './component/CandidateComponent';
ReactDOM.render(
  <React.StrictMode>
    <Router>
      <Navigation />
      <Routes>
        <Route exact path="/candidates" element={<CandidateComponent />} />
        <Route exact path="/candidates" element={<CandidateComponent />} />
        {/* Add other routes for other components */}
      </Routes>
    </Router>
  </React.StrictMode>,
  document.getElementById('root')
);