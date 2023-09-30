import React, { useEffect, useState } from 'react';
import { getAllCandidates, createCandidate, updateCandidate, deleteCandidate } from '../services/candidateService';

const CandidateComponent = () => {
  const [candidates, setCandidates] = useState([]);
  const [newCandidate, setNewCandidate] = useState({
    name: '',
    phone: '',
    email: '',
  });

  // Load all candidates on component mount
  useEffect(() => {
    const fetchCandidates = async () => {
      try {
        const candidatesData = await getAllCandidates();
        setCandidates(candidatesData);
      } catch (error) {
        console.error('Error fetching candidates:', error);
      }
    };

    fetchCandidates();
  }, []);

  // Handle form input changes
  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setNewCandidate((prevCandidate) => ({
      ...prevCandidate,
      [name]: value,
    }));
  };

  // Handle form submission to create a new candidate
  const handleSubmit = async (event) => {
    event.preventDefault();

    try {
      const createdCandidate = await createCandidate(newCandidate);
      setCandidates((prevCandidates) => [...prevCandidates, createdCandidate]);
      setNewCandidate({
        name: '',
        phone: '',
        email: '',
      });
    } catch (error) {
      console.error('Error creating candidate:', error);
    }
  };

  // Render the component
  return (
    <div>
      <h2>Candidates</h2>

      {/* Candidate List */}
      <ul>
        {candidates.map((candidate) => (
          <li key={candidate.id}>
            <span>{candidate.name}</span>
            <span>{candidate.phone}</span>
            <span>{candidate.email}</span>
          </li>
        ))}
      </ul>

      {/* New Candidate Form */}
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="name"
          placeholder="Name"
          value={newCandidate.name}
          onChange={handleInputChange}
        />
        <input
          type="text"
          name="phone"
          placeholder="Phone"
          value={newCandidate.phone}
          onChange={handleInputChange}
        />
        <input
          type="text"
          name="email"
          placeholder="Email"
          value={newCandidate.email}
          onChange={handleInputChange}
        />
        <button type="submit">Create Candidate</button>
      </form>
    </div>
  );
};

export default CandidateComponent;
