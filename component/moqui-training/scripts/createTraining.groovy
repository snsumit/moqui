
if (!trainingName) {
    ec.message.addError("The parameter 'trainingName' is required.")
    return
}


def training = ec.entity.makeValue("training.MoquiTraining")
training.trainingId=trainingId;
training.trainingName = trainingName
training.trainingDuration=trainingDuration
training.trainingDate =trainingDate;
training.trainingPrice = trainingPrice;



training.create()


return [responseMessage: "Training [${trainingName}] created successfully!"]
