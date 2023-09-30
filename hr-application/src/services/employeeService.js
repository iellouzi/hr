import axios from 'axios';

const API_BASE_URL = 'http://localhost:8054/api';

// Create a employee
export const createEmployee = async (employeeData) => {
  try {
    const response = await axios.post(`${API_BASE_URL}/employees`, employeeData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get all employees
export const getAllEmployees = async () => {
  try {
    const response = await axios.get(`${API_BASE_URL}/employees`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Get a employee by ID
export const getEmployeeById = async (employeeId) => {
  try {
    const response = await axios.get(`${API_BASE_URL}/employees/${employeeId}`);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Update a employee
export const updateEmployee = async (employeeId, employeeData) => {
  try {
    const response = await axios.put(`${API_BASE_URL}/employees/${employeeId}`, employeeData);
    return response.data;
  } catch (error) {
    throw error;
  }
};

// Delete a employee
export const deleteEmployee = async (employeeId) => {
  try {
    await axios.delete(`${API_BASE_URL}/employees/${employeeId}`);
  } catch (error) {
    throw error;
  }
};
