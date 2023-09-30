import axios from 'axios';

const API_BASE_URL = 'http://localhost:8054/api';

// Create a evaluation
export const createEvaluation = async (evaluationData) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/evaluations`, evaluationData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get all evaluations
export const getAllEvaluations = async () => {
  try {
    const response = await axios.get(`${API_BASE_URL}/evaluations`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get a evaluation by ID
export const getEvaluationById = async (evaluationId) => {
  try {
    const response = await axios.get(`${API_BASE_URL}/evaluations/${evaluationId}`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Update a evaluation
export const updateEvaluation = async (evaluationId, evaluationData) => {
  try {
    const response = await axios.put(`${API_BASE_URL}/evaluations/${evaluationId}`, evaluationData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Delete a evaluation
export const deleteEvaluation = async (evaluationId) => {
  try {
    await axios.delete(`${API_BASE_URL}/evaluations/${evaluationId}`);
  } catch (error) {
    throw error;
  }
};
