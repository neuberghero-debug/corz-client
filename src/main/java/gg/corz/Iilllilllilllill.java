package gg.corz;

import net.minecraft.class_1923;

public class Iilllilllilllill {
   public final iilIiillIIiIiill iliIlIiill;
   public final int lliIlIiill;
   public final int illIlIiill;
   public final int iilIlIiill;
   public final int lIiIlIiill;
   public final int iIiIlIiill;
   public final class_1923 lllIlIiill;
   public final int IliIlIiill;
   public final IIIIlIIilIIIlIIi IilIlIiill;
   public final llllllililllllil lilIlIiill;
   public final int IIiIlIiill;

   public Iilllilllilllill(
      class_1923 surfaceY,
      int totalScore,
      IIIIlIIilIIIlIIi chunkPos,
      llllllililllllil confidence,
      int playerScore,
      int kindOverride,
      int type,
      int spawnerCount,
      int trialCount,
      int storageCount,
      iilIiillIIiIiill categoryCount
   ) {
      this.lllIlIiill = surfaceY;
      this.illIlIiill = totalScore;
      this.IilIlIiill = chunkPos;
      this.lilIlIiill = confidence;
      this.iilIlIiill = playerScore;
      this.IIiIlIiill = kindOverride;
      this.lIiIlIiill = type;
      this.iIiIlIiill = spawnerCount;
      this.IliIlIiill = trialCount;
      this.lliIlIiill = storageCount;
      this.iliIlIiill = categoryCount != null ? categoryCount : IiiliIiliiliIi.liIiiiiIii(storageCount, type, spawnerCount, trialCount, chunkPos);
   }

   boolean IliIlllilIi(Iilllilllilllill o) {
      return o != null
         && this.illIlIiill == o.illIlIiill
         && this.IilIlIiill == o.IilIlIiill
         && this.lilIlIiill == o.lilIlIiill
         && this.iilIlIiill == o.iilIlIiill
         && this.lIiIlIiill == o.lIiIlIiill
         && this.iIiIlIiill == o.iIiIlIiill
         && this.IliIlIiill == o.IliIlIiill
         && this.lliIlIiill == o.lliIlIiill
         && this.iliIlIiill == o.iliIlIiill;
   }

   public Iilllilllilllill(
      class_1923 playerScore,
      int categoryCount,
      IIIIlIIilIIIlIIi totalScore,
      llllllililllllil chunkPos,
      int surfaceY,
      int trialCount,
      int storageCount,
      int confidence,
      int type,
      int spawnerCount
   ) {
      this(playerScore, categoryCount, totalScore, chunkPos, surfaceY, trialCount, storageCount, confidence, type, spawnerCount, null);
   }
}
