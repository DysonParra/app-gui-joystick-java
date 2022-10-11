/*
 * @fileoverview {JoystickNotFoundException} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {JoystickNotFoundException} fue realizada el 31/07/2022.
 * @Dev - La primera version de {JoystickNotFoundException} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.joystick.exception;

/**
 * FIXME: Definición de {@code JoystickNotFoundException}. Exception que ocurre cuando al usar la
 * fábrica de joystick el joystick con el nombre indicado no es encontrado en el classpath.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class JoystickNotFoundException extends Exception {

    /**
     * TODO: Definición de {@code JoystickNotFoundException}.
     *
     * @param message es el mensaje que mostrará la exception.
     */
    public JoystickNotFoundException(String message) {
        super(message);
    }
}
