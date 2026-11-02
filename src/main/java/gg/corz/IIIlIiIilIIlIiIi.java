package gg.corz;

public final class IIIlIiIilIIlIiIi {
   private String iiIIIIiIIi;
   private final int liIIIIiIIi;
   private int IIlIIIiIIi;

   public void iIlIlllllill() {
      this.iiIIIIiIIi = null;
      this.IIlIIIiIIi = 0;
   }

   public boolean IliIlllilIi(String mismatch, boolean transientNeighbourState, boolean botOwned) {
      if (mismatch != null && !mismatch.isBlank() && !botOwned && transientNeighbourState) {
         if (!mismatch.equals(this.iiIIIIiIIi)) {
            this.iiIIIIiIIi = mismatch;
            this.IIlIIIiIIi = 1;
         } else {
            this.IIlIIIiIIi++;
         }

         return this.IIlIIIiIIi >= this.liIIIIiIIi;
      } else {
         this.iIlIlllllill();
         return false;
      }
   }

   public IIIlIiIilIIlIiIi(int requiredObservations) {
      this.liIIIIiIIi = Math.max(2, requiredObservations);
   }

   public int liiiIIllIl() {
      return this.IIlIIIiIIi;
   }
}
