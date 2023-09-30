import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import CandidateComponent from './component/CandidateComponent';

const App = () => {
  return (
    <Router>
      <Routes>
        <Route exact path="/candidates" component={CandidateComponent} />
        <Route exact path="/candidates" component={CandidateComponent} />
        {/* Add other routes for other components */}
      </Routes>
    </Router>
  );
};
export default App;
