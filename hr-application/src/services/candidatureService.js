import axios from 'axios';

const API_BASE_URL = 'http://localhost:8054/api';

// Create a candidature
export const createCandidature = async (candidatureData) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/candidatures`, candidatureData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get all candidatures
export const getAllCandidatures = async () => {
  try {
    const response = await axios.get(`${API_BASE_URL}/candidatures`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get a candidature by ID
export const getCandidatureById = async (candidatureId) => {
  try {
    const response = await axios.get(`${API_BASE_URL}/candidatures/${candidatureId}`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Update a candidature
export const updateCandidature = async (candidatureId, candidatureData) => {
  try {
    const response = await axios.put(`${API_BASE_URL}/candidatures/${candidatureId}`, candidatureData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Delete a candidature
export const deleteCandidature = async (candidatureId) => {
  try {
    await axios.delete(`${API_BASE_URL}/candidatures/${candidatureId}`);
  } catch (error) {
    throw error;
  }
};
