
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if(Math.ceil(width) <= 0 || Math.ceil(height) <= 0 || Math.ceil(areaPerBucket) <= 0 || extraBucket < 0){
            return -1;
        }
        double areaOfWall = width * height;
        double bucketNeededPerArea = Math.ceil(areaOfWall / areaPerBucket);
        double bucketNeeded = bucketNeededPerArea -extraBucket;
        return (int)bucketNeeded;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(Math.ceil(width) <= 0 ||Math.ceil(height) <= 0 || Math.ceil(areaPerBucket) <= 0){
            return -1;
        }
        double areaOfWall = width * height;
        double bucketNeededPerArea = Math.ceil(areaOfWall/ areaPerBucket);
        return (int)bucketNeededPerArea;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(Math.ceil(area) <= 0 || Math.ceil(areaPerBucket) <= 0){
            return -1;
        }
        double bucketNeededPerArea = Math.ceil(area/ areaPerBucket);
        return (int)bucketNeededPerArea;
    }
}
