/*
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.employees;

import com.clover.sdk.v3.employees.Employee;

/**
 * An interface for receiving events pertaining to an employee. Add a listener as follows,
 * <pre>
 * <code>
 * iEmployeeService.addListener(new IEmployeeListener.Stub() {
 *     {@literal @}Override
 *     public void onActiveEmployeeChanged(Merchant merchant) {
 *       // active employee has changed, use it here
 *     }
 * };
 * </code>
 * </pre>
 * If using {@link com.clover.sdk.v1.employee.EmployeeConnector} to interact with the employee
 * serivce, you may add listeners there.
 *
 * @see com.clover.sdk.v1.employee.IEmployeeService
 * @see com.clover.sdk.v1.employee.IEmployeeService#addListener(IEmployeeListener,ResultStatus)
 * @see com.clover.sdk.v1.employee.IEmployeeService#removeListener(IEmployeeListener,ResultStatus)
 * @see com.clover.sdk.v1.employee.EmployeeConnector
 */
oneway interface IEmployeeListener {
    void onActiveEmployeeChanged(in Employee employee);
}