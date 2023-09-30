import React, { useEffect, useState } from 'react';
import { getAllCandidates, createCandidate, updateCandidate, deleteCandidate } from '../services/candidateService';
import '../style/candidate.css';
const CandidateComponent = () => {
  const [candidates, setCandidates] = useState([]);
  const [newCandidate, setNewCandidate] = useState({
    name: '',
    phone: '',
    email: '',
  });

// State to track the candidate being edited
const [editingCandidate, setEditingCandidate] = useState(null);
// State to store the updated candidate data
const [updatedCandidateData, setUpdatedCandidateData] = useState({
  name: '',
  phone: '',
  email: '',
});

// Handle editing a candidate
const handleEditCandidate = (candidate) => {
  setEditingCandidate(candidate);
  // Set the initial values for the updatedCandidateData
  setUpdatedCandidateData({
    name: candidate.name,
    phone: candidate.phone,
    email: candidate.email,
  });
};

// Handle canceling the edit mode
const cancelEdit = () => {
  setEditingCandidate(null);
};

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
  
    // Handle deletion of a candidate
    const handleDeleteCandidate = async (candidateId) => {
      try {
        await deleteCandidate(candidateId);
        setCandidates((prevCandidates) => prevCandidates.filter((candidate) => candidate.id !== candidateId));
      } catch (error) {
        console.error('Error deleting candidate:', error);
      }
    };
  
// Handle updating a candidate
const handleUpdateCandidate = async (candidateId) => {
  try {
    const updatedCandidate = await updateCandidate(candidateId, updatedCandidateData);
    setCandidates((prevCandidates) =>
      prevCandidates.map((candidate) => {
        if (candidate.id === candidateId) {
          return { ...candidate, ...updatedCandidate };
        }
        return candidate;
      })
    );
    setEditingCandidate(null); // Reset editing state after successful update
  } catch (error) {
    console.error('Error updating candidate:', error);
  }
};

  // Render the component
  return (


    





<div className="container mx-auto">
<h2 className="text-2xl font-semibold mb-4">Candidates</h2>

<form onSubmit={handleSubmit} className="mb-4">
  <input
    type="text"
    name="name"
    placeholder="Name"
    value={newCandidate.name}
    onChange={handleInputChange}
    className="border border-gray-300 rounded-lg py-2 px-4 w-full mb-2"
  />
  <input
    type="text"
    name="phone"
    placeholder="Phone"
    value={newCandidate.phone}
    onChange={handleInputChange}
    className="border border-gray-300 rounded-lg py-2 px-4 w-full mb-2"
  />
  <input
    type="text"
    name="email"
    placeholder="Email"
    value={newCandidate.email}
    onChange={handleInputChange}

className="border border-gray-300 rounded-lg py-2 px-4 w-full mb-2"
/>
<button
  type="submit"
  className="bg-blue-500 hover:bg-blue-600 text-white font-semibold py-2 px-4 rounded-lg"
>
  Create Candidate
</button>
</form>

<ul>
{candidates.map((candidate) => (
  <li key={candidate.id} className="flex items-center mb-2">
    <span className="mr-2">{candidate.name}</span>
    <span className="mr-2">{candidate.phone}</span>
    <span className="mr-2">{candidate.email}</span>
    <button
      onClick={() => handleDeleteCandidate(candidate.id)}
      className="bg-red-500 hover:bg-red-600 text-white font-semibold py-2 px-4 rounded-lg mr-2"
    >
      Delete
    </button>

    {editingCandidate && editingCandidate.id === candidate.id ? (
      <form
        onSubmit={(e) => handleUpdateCandidate(candidate.id)}
        className="flex items-center"
      >
        <input
          type="text"
          name="name"
          placeholder="Name"
          value={updatedCandidateData.name}
          onChange={(e) =>
            setUpdatedCandidateData({ ...updatedCandidateData, name: e.target.value })
          }
          className="border border-gray-300 rounded-lg py-2 px-4 w-full mb-2"
        />
        <input
          type="text"
          name="phone"
          placeholder="Phone"
          value={updatedCandidateData.phone}
          onChange={(e) =>
            setUpdatedCandidateData({ ...updatedCandidateData, phone: e.target.value })
          }
          className="border border-gray-300 rounded-lg py-2 px-4 w-full mb-2"
        />
        <input
          type="text"
          name="email"
          placeholder="Email"
          value={updatedCandidateData.email}
          onChange={(e) =>
            setUpdatedCandidateData({ ...updatedCandidateData, email: e.target.value })
          }
          className="border border-gray-300 rounded-lg py-2 px-4 w-full mb-2"
        />
        <button
          type="submit"
          className="bg-green-500 hover:bg-green-600 text-white font-semibold py-2 px-4 rounded-lg mr-2"
        >
          Save
        </button>
        <button
          type="button"
          onClick={cancelEdit}
          className="bg-gray-500 hover:bg-gray-600 text-white font-semibold py-2 px-4 rounded-lg"
        >
          Cancel
        </button>
      </form>
    ) : (
      <button
        onClick={() => handleEditCandidate(candidate)}
        className="bg-blue-500 hover:bg-blue-600 text-white font-semibold py-2 px-4 rounded-lg"
      >
        Edit
      </button>
    )}
  </li>
))}
</ul>
</div>



  );
};

export default CandidateComponent;
