// Copyright © 2012 Solita Oy <www.solita.fi>
// This software is released under the MIT License.
// The license text is at http://opensource.org/licenses/MIT

package fi.solita.jsonmigraine;

public class HowToUpgrade {

    public final Class<?> dataType;
    public final Upgrader upgrader;

    public HowToUpgrade(Class<?> dataType, Upgrader upgrader) {
        this.dataType = dataType;
        this.upgrader = upgrader;
    }
}
