/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivianuu.simplemvvm.sample;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import com.ivianuu.simplemvvm.fragment.MVVMFragmentViewModel;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * @author Manuel Wrage (IVIanuu)
 */
public class MainFragmentViewModel extends MVVMFragmentViewModel {

    public MainFragmentViewModel() {
        Log.d("testtt", "init");
        arguments().subscribe(new Consumer<Bundle>() {
                    @Override
                    public void accept(@NonNull Bundle bundle) throws Exception {

                    }
                });
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d("testtt", "cleared");
    }
}
