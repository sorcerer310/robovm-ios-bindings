
package org.robovm.bindings.gpgs;

import org.robovm.apple.foundation.NSError;

public interface GPGAchievementDidResetBlock {

	/** Runs this block. */
	void invoke (NSError error);

}