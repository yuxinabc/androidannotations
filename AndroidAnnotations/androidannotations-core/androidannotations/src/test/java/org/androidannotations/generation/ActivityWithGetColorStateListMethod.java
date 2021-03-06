/**
 * Copyright (C) 2010-2015 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.generation;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.res.ColorStateListRes;

import android.app.Activity;
import android.content.res.ColorStateList;

@EActivity
public class ActivityWithGetColorStateListMethod extends Activity {

	@ColorStateListRes(R.color.myColorStateList)
	ColorStateList myColorStateList;

	// http://developer.android.com/reference/android/content/Context.html#getColorStateList(int)
	// This method was added in API 23 and should be used to get a ColorStateList which is styled/adjusted for the current theme.
	public ColorStateList getColorStateList(int id) {
		return null;
	}

}
