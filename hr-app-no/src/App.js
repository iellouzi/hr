import React from 'react';
import { BrowserRouter as Router, Routes , Route } from 'react-router-dom';
import CandidateComponent from './component/CandidateComponent'; // Import your CandidateComponent
// Import other components for routing

const App = () => {
  return (
    <Router>
      <Routes>
        <Route exact path="/candidates" component={CandidateComponent} />
        {/* Add other routes for other components */}
      </Routes>
    </Router>
  );
};

export default App;
