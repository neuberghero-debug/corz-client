package gg.corz;

final class iIilIiIlilIi {
   final double lIIilIIIliIIilIIIl;
   final double iiillIIIlIIIilIIIl;
   final float IlIilIIIlllIilIIIl;
   final double IiillIIIlliillIIIl;
   final long liIilIIIliiIilIIIl;
   final float ilIilIIIlIiIilIIIl;

   float IliIlllilIi(long now) {
      return (float)(now - this.liIilIIIliiIilIIIl) / 1.0E9F;
   }

   iIilIiIlilIi(double x, double spawnNanos, double yLift, float z, float y, long yaw) {
      this.IiillIIIlliillIIIl = x;
      this.iiillIIIlIIIilIIIl = spawnNanos;
      this.lIIilIIIliIIilIIIl = yLift;
      this.IlIilIIIlllIilIIIl = z;
      this.ilIilIIIlIiIilIIIl = y;
      this.liIilIIIliiIilIIIl = yaw;
   }
}
