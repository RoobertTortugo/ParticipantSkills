package com.co.groupingList.services;

import com.co.groupingList.model.ParticipantsEntity;

import java.util.ArrayList;
import java.util.List;

public class CreateParticipants {

    public List<ParticipantsEntity> participants (){

        final List<ParticipantsEntity> participantsEntityList = new ArrayList<>();
        participantsEntityList.add(
                ParticipantsEntity.builder().age("37").name("Claudio Bravo").skill("Junior 1").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("36").name("Jean Beausejour").skill("Junior 2").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("34").name("Gonzalo Jara").skill("Advance 1").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("33").name("Gary Medel").skill("Advance 3").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("32").name("Mauricio Isla").skill("Advance 2").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("31").name("Charles Aránguiz").skill("Senior 3").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("30").name("Arturo Vidal").skill("Senior 2").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("33").name("Matias Fernandez").skill("Master 1").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("36").name("Jorge Valdivia").skill("Master 2").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("36").name("Eduardo Vargas").skill("Senior 1").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("33").name("Alexis Sánchez").skill("Senior 2").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("31").name("Uldrey Galleo").skill("Junior 3").build());
        participantsEntityList.add(
                ParticipantsEntity.builder().age("30").name("Carlan Gotan").skill("Master 1").build());
        return participantsEntityList;
    }
}
