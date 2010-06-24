package audio.graph;
import src/groovy/audio.graph
ReadTonesFile tones = new ReadTonesFile()
List tonesList = tones.readTones('d:tones.txt')
Datareader data = new DataReader()
List x = data.readX('d:data.txt')
List y = data.readY('d:data.txt')
ValueToTone values = new ValueToTone()
List notes  =values.toTones(y, tonesList)
MelodyBuilderB melody = new MelodyBuilderB()
String pattern = melody.addLength(notes, 'q')
SoundPlayer sound = new SoundPlayer()
sound.createSound(pattern)