/*
 * {{{ header & license
 * PropertyDeclarationFactory.java
 * Copyright (c) 2004 Patrick Wright
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.css.sheet.factory;

import java.util.Iterator;
import org.w3c.dom.css.CSSStyleDeclaration;
import org.xhtmlrenderer.css.sheet.PropertyDeclaration;


/**
 * Interface for factories that build PropertyDeclarations from info gathered in
 * a SAC CSSStyleDeclaration. There will normally be one factory per shorthand
 * property type (like "border"), and one generic factory.
 *
 * @author   Patrick Wright
 */
public interface PropertyDeclarationFactory {
    /**
     * Explodes a single property declaration in raw form (as provided by a SAC
     * parser) into one or more PropertyDeclaration instances. Normally one
     * would expect just on PropertyDeclaration for a CSS property, but
     * shorthand declarations are resolved into many individual property
     * assignments. The exact form of the explosion is left to the implementing
     * class.
     *
     * @param style     The {@link org.w3c.dom.css.CSSStyleDeclaration} from the SAC parser.
     * @param propName  The String property name for the property to explode.
     * @return          Iterator of one or more PropertyDeclaration instances
     *      representing the exploded values.
     */
    Iterator buildDeclarations( CSSStyleDeclaration style, 
                                String propName, 
                                int origin );
}// end class

/*
 * $Id$
 *
 * $Log$
 * Revision 1.2  2005/01/24 14:54:53  pdoubleya
 * Comments referred to old class.
 *
 * Revision 1.1  2005/01/24 14:25:36  pdoubleya
 * Added to CVS.
 *
 *
 */

