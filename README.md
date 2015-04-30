# MvpTemplate
Android basic project using MVP (Model-View-Presenter) pattern.
Inspired by https://github.com/glomadrian/MvpCleanArchitecture with some modifications to make developing MVP pattern apps easier.

# Getting Started
Just clone this repository and get started like always.
This project can be deployed and should run simple application showing simple data.

## MVP Structure
This project contains 4 main packages.

1. app : Contains dependency injection for global use and some base classes.
1. domain : Contains data related class. 
   * Interactor is used in presenter to get data. 
   * Model is used to define the data model.
   * Repository is used to define how the application should get the data.
1. executor : Used to execute interactor in different thread with the callback if successfully get the data.
1. ui : Layout related class.
   * presenter : bridge between interactor and the layout (fragment or activity). Manage fragment behavior.
   * view : view related interface.

## Copyright
   Copyright 2014 Google Inc. All rights reserved.
   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
     http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
