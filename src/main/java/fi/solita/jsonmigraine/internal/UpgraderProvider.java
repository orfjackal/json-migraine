// Copyright © 2012 Solita Oy <www.solita.fi>
// This software is released under the MIT License.
// The license text is at http://opensource.org/licenses/MIT

package fi.solita.jsonmigraine.internal;

import fi.solita.jsonmigraine.api.Upgrader;

public interface UpgraderProvider {

    Upgrader getUpgrader(Class<?> type);
}
