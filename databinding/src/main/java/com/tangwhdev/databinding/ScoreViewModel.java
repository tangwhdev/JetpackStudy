package com.tangwhdev.databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    MutableLiveData<Integer> aTeamScore = new MutableLiveData<>(0);
    MutableLiveData<Integer> bTeamScore = new MutableLiveData<>(0);
    private Integer lastAScore;
    private Integer lastBScore;

    public MutableLiveData<Integer> getbTeamScore() {
        return bTeamScore;
    }

    public MutableLiveData<Integer> getaTeamScore() {
        return aTeamScore;
    }

    public void addATeamScore(int i){
        saveScore();
        aTeamScore.setValue(aTeamScore.getValue()+i);
    }
    public void addBTeamScore(int i){
        saveScore();
        bTeamScore.setValue(bTeamScore.getValue()+i);
    }
    public void resetScore(){
        aTeamScore.setValue(0);
        bTeamScore.setValue(0);
    }


    public void clearScore(){
        aTeamScore.setValue(lastAScore);
        bTeamScore.setValue(lastBScore);
    }

    public void saveScore(){
        lastAScore = aTeamScore.getValue();
        lastBScore = bTeamScore.getValue();
    }
}
