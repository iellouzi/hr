import axios from 'axios';

const API_BASE_URL = 'http://localhost:8054/api';

// Create a offer
export const createOffer = async (offerData) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/offers`, offerData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get all offers
export const getAllOffers = async () => {
  try {
    const response = await axios.get(`${API_BASE_URL}/offers`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get a offer by ID
export const getOfferById = async (offerId) => {
  try {
    const response = await axios.get(`${API_BASE_URL}/offers/${offerId}`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Update a offer
export const updateOffer = async (offerId, offerData) => {
  try {
    const response = await axios.put(`${API_BASE_URL}/offers/${offerId}`, offerData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Delete a offer
export const deleteOffer = async (offerId) => {
  try {
    await axios.delete(`${API_BASE_URL}/offers/${offerId}`);
  } catch (error) {
    throw error;
  }
};
