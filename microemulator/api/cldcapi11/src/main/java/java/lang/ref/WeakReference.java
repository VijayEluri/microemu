/*
 *   
 *
 * Copyright  1990-2007 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included at /legal/license.txt).
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa
 * Clara, CA 95054 or visit www.sun.com if you need additional
 * information or have any questions.
 */

package java.lang.ref;

/**
 * This class provides support for weak references. Weak references
 * are most often used to implement canonicalizing mappings.
 *
 * Suppose that the garbage collector determines at a certain
 * point in time that an object is weakly reachable.  At that
 * time it will atomically clear all the weak references to
 * that object and all weak references to any other weakly-
 * reachable objects from which that object is reachable
 * through a chain of strong and weak references.
 *
 * @version  12/19/01 (CLDC 1.1)
 * @since    JDK1.2, CLDC 1.1
 */

public class WeakReference extends Reference {

    /**
     * Creates a new weak reference that refers to the given object.
     */
    public WeakReference(Object referent) {
        super(referent);
    }

}
