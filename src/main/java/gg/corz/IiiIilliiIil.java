package gg.corz;

import java.util.Locale;

public record IiiIilliiIil(
   int id,
   String kind,
   int plannedMembers,
   int attempted,
   int confirmed,
   int tempPlaced,
   int tempRemoved,
   double travel,
   int jumpTransitions,
   int verticalTransitions,
   int durationTicks,
   ilIiiIiIiIiiIi yieldReason
) {
   private final String iIilIlliIlilIlli;
   private final int IiilIlliliilIlli;
   private final int IIilIllilIilIlli;
   private final int IlIiIllillIiIlli;
   private final double ilIiIlliIiIiIlli;
   private final ilIiiIiIiIiiIi llliIlliilliIlli;
   private final int IIliIllilIliIlli;
   private final int llilIlliililIlli;
   private final int liIiIlliiiIiIlli;
   private final int iIliIlliIlliIlli;
   private final int iiilIlliIIIiIlli;
   private final int lIIiIlliiIIiIlli;

   public int Iilllilliill() {
      return this.IIliIllilIliIlli;
   }

   public int IiIlliIliiIl() {
      return this.IlIiIllillIiIlli;
   }

   public String liiiIIllIl() {
      return String.format(
         Locale.ROOT,
         Iiilliiliiil<"Iiilliiliiil","rBHAKiZSG+joy5sRlRt0zm9tyGErYSd5Fje7HxBlCSeqwP/o3NBfo7mZV17cjP5DYnOc5TfaMpNl8IOk6oEv4SLn+G1LOdsU9u9YEdE9UEUQ0gH1X8eqpgHj9l3WHrNBGUVMXvLEpFiglW46ulg326Pd+ZaPzAyaX/q0WvsVR3ZKff2ZKoTjYgvxgCsmcZRhfLjZ1QxDVOESZhMqk0f3OMpulBUvqFgIzeEVIGdiSpVENyrvQT3iA8/UpikSh5Y+sOz+9WPECgw=">(),
         this.IIilIllilIilIlli,
         this.iIilIlliIlilIlli,
         this.llilIlliililIlli,
         this.IiilIlliliilIlli,
         this.iiilIlliIIIiIlli,
         this.lIIiIlliiIIiIlli,
         this.IlIiIllillIiIlli,
         this.ilIiIlliIiIiIlli,
         this.liIiIlliiiIiIlli,
         this.IIliIllilIliIlli,
         this.iIliIlliIlliIlli,
         this.llliIlliilliIlli
      );
   }

   public String IilliliilIIi() {
      return this.iIilIlliIlilIlli;
   }

   public IiiIilliiIil(
      int id,
      String kind,
      int plannedMembers,
      int attempted,
      int confirmed,
      int tempPlaced,
      int tempRemoved,
      double travel,
      int jumpTransitions,
      int verticalTransitions,
      int durationTicks,
      ilIiiIiIiIiiIi yieldReason
   ) {
      this.IIilIllilIilIlli = id;
      this.iIilIlliIlilIlli = kind;
      this.llilIlliililIlli = plannedMembers;
      this.IiilIlliliilIlli = attempted;
      this.iiilIlliIIIiIlli = confirmed;
      this.lIIiIlliiIIiIlli = tempPlaced;
      this.IlIiIllillIiIlli = tempRemoved;
      this.ilIiIlliIiIiIlli = travel;
      this.liIiIlliiiIiIlli = jumpTransitions;
      this.IIliIllilIliIlli = verticalTransitions;
      this.iIliIlliIlliIlli = durationTicks;
      this.llliIlliilliIlli = yieldReason;
   }

   public int IIillIiliIil() {
      return this.iIliIlliIlliIlli;
   }

   public int IlIlllIlilIl() {
      return this.lIIiIlliiIIiIlli;
   }

   public int iliIiiliiiii() {
      return this.IiilIlliliilIlli;
   }

   public int iIlIlllllill() {
      return this.IIilIllilIilIlli;
   }

   public double IIlllIlliIll() {
      return this.ilIiIlliIiIiIlli;
   }

   public int Illlllllilll() {
      return this.liIiIlliiiIiIlli;
   }

   public int IIIllIIliIIl() {
      return this.iiilIlliIIIiIlli;
   }

   public ilIiiIiIiIiiIi Ililllililil() {
      return this.llliIlliilliIlli;
   }

   public double IliIlllilIi() {
      return this.iIliIlliIlliIlli <= 0 ? 0.0 : (double)this.iiilIlliIIIiIlli * 20.0 / (double)this.iIliIlliIlliIlli;
   }

   public int lIiiIiIlilli() {
      return this.llilIlliililIlli;
   }
}
