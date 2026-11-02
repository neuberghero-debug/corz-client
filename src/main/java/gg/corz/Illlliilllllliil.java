package gg.corz;

final class Illlliilllllliil {
   final double iIIlIiilil;
   final double ilIlIiilil;
   final double llIlIiilil;
   final double IlIlIiilil;
   final long lIIlIiilil;

   boolean IliIlllilIi(Illlliilllllliil other) {
      return other != null
         && this.iIIlIiilil == other.iIIlIiilil
         && this.IlIlIiilil == other.IlIlIiilil
         && this.llIlIiilil == other.llIlIiilil
         && this.ilIlIiilil == other.ilIlIiilil;
   }

   Illlliilllllliil(long chunkKey, double score, double hitX, double hitZ, double hitWeight) {
      this.lIIlIiilil = chunkKey;
      this.iIIlIiilil = score;
      this.IlIlIiilil = hitX;
      this.llIlIiilil = hitZ;
      this.ilIlIiilil = hitWeight;
   }
}
