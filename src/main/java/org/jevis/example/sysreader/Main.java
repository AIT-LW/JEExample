/**
 * Copyright (C) 2015 Envidatec GmbH <info@envidatec.com>
 *
 * This file is part of JEVisExample.
 *
 * JEVisExample is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation in version 3.
 *
 * JEVisExample is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * JEVisExample. If not, see <http://www.gnu.org/licenses/>.
 *
 * JEVisExample is part of the OpenJEVis project, further project information
 * are published at <http://www.OpenJEVis.org/>.
 */
package org.jevis.example.sysreader;

import org.jevis.api.JEVisException;

/**
 * Main class of this Example. This example implements some common tasks with the
 * JEVis System to help new developers to use the JEAPI.
 *
 * This is a Maven Project and needs the local dependencies of
 * JEAPI-SQL(JEAPI,JECommons)
 *
 * TODO: implement the Maven dependencies from our buildserver
 *
 * TODO: example of changing existing Objects,Classes,Samples
 *
 * TODO: example of deleting Objects, Classes, Samples
 *
 * TODO: example of a typical workflow for GUI and services.
 *
 * TODO: example of navigation within the JEVisOBject tree.
 *
 * @author Florian Simon <florian.simon@envidatec.com>
 */
public class Main {

    /**
     * Main class to start the examples.
     *
     * TODO: get the start parameter/configuration by using our common JECommons
     * function.
     *
     * @param args
     * @throws JEVisException
     */
    public static void main(String[] args) throws JEVisException {
        //create an new Example, this example has hardcodet connection settings.
        //Change these settings to your server configuration
        BasicExamples example = new BasicExamples("openjevis.org", "13306", "jevis", "jevis", "jevistest", "myUser", "myPW");

        //Example which prints all Objects which are from the JEVisClass
        //given by its name (in this case "Data")
        example.printObjects("Data");

        //Example which prints some information about the given JEVisClass
        //(in this case "Email Plugin")
        example.printClass("Email Plugin");

        //Example of writing new values to the JEVis system. The parameters are
        //the unique id of the object and its JEVisAttribute name where the data
        //should be stored
        example.writeToJEVis(1588l, "Value");

        //Example of creating an new JEVisObject in the JEVis System.
        // - 1587 is the parent Object,
        // - "Data" is the JEVisClass of the new Object,
        // - "My new Data Object" is the name
        example.createObject(1587l, "Data", "My new Data Object");

    }
}
