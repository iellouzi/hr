import React from 'react';
import { Link } from 'react-router-dom';

const Navigation = () => {
  return (
    <nav>
      <ul>
        <li>
          <Link to="/candidates">Candidates</Link>
        </li>
        {/* Add other navigation links for other components */}
      </ul>
    </nav>
  );
};

export default Navigation;
