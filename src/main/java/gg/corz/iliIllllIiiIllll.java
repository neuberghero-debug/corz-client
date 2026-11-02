package gg.corz;

import java.util.Objects;

public record iliIllllIiiIllll(String reason, long target, long planId, int activeLayer) {
   private final String iiIlilIill;
   private final long lIllilIill;
   private final long IIllilIill;
   private final int iIllilIill;

   public iliIllllIiiIllll(String reason, long target, long planId, int activeLayer) {
      reason = Objects.requireNonNullElse(reason, iliIiiliiiii<"iliIiiliiiii","b7AOlTczfD/5FWVyK/GIISDQneOIwSD216bSrPvWUWXPyJE=">());
      this.iiIlilIill = reason;
      this.IIllilIill = target;
      this.lIllilIill = planId;
      this.iIllilIill = activeLayer;
   }

   public long IliIlllilIi() {
      long var1 = -3750763034362895579L;
      var1 = (var1 ^ (long)this.iiIlilIill.hashCode()) * 1099511628211L;
      var1 = (var1 ^ this.IIllilIill) * 1099511628211L;
      var1 = (var1 ^ this.lIllilIill) * 1099511628211L;
      return (var1 ^ (long)this.iIllilIill) * 1099511628211L;
   }

   public long iIlIlllllill() {
      return this.IIllilIill;
   }

   public long IilliliilIIi() {
      return this.lIllilIill;
   }

   public int lIiiIiIlilli() {
      return this.iIllilIill;
   }

   public String liiiIIllIl() {
      return this.iiIlilIill;
   }
}
