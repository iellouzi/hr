import axios from 'axios';

const API_BASE_URL = 'http://localhost:8054/api';

// Create a candidate
export const createCandidate = async (candidateData) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/candidates`, candidateData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get all candidates
export const getAllCandidates = async () => {
  try {
    const response = await axios.get(`${API_BASE_URL}/candidates`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get a candidate by ID
export const getCandidateById = async (candidateId) => {
  try {
    const response = await axios.get(`${API_BASE_URL}/candidates/${candidateId}`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Update a candidate
export const updateCandidate = async (candidateId, candidateData) => {
  try {
    const response = await axios.put(`${API_BASE_URL}/candidates/${candidateId}`, candidateData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Delete a candidate
export const deleteCandidate = async (candidateId) => {
  try {
    await axios.delete(`${API_BASE_URL}/candidates/${candidateId}`);
  } catch (error) {
    throw error;
  }
};
